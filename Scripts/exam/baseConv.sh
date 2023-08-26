dec () {
	#call convention
	#dec {Digit to decode} {Current Base}
	#will return/echo -1 if invalid digit
	#current limit till base 16
	#can be expanded till base 36 by extending string till Z/z
	ch="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	ch2="0123456789abcdefghijklmnopqrstuvwxyz"
	v=`echo $ch | cut -c1-$2 | grep -b -o $1`
	if [ $? -eq 0 ]
	then
		v=`echo $v | cut -d: -f1`
	else
		v=`echo $ch2 | cut -c-$2 | grep -b -o $1`
		if [ $? -eq 0 ]
		then
			v=`echo $v | cut -d: -f1`
		else
			v=-1
		fi
	fi
	echo $v
}

enc () {
	#call convention
	#enc {value to encode in decimal} {base to encode to}
	#will return/echo -1 if invalid base
	#current limit till base 16
        #can be expanded till base 36 by extending string till Z/z
	ch="0123456789abcdefghijklmnopqrstuvwxyz"
	lim=$((`echo $ch | wc -m`-1))
	v=`echo $ch | cut -c$(($1+1))`
	if [ $1 -ge $2 ] || [ $2 -gt $lim ]
	then
		v=-1
	fi
	echo $v
}

lim=36
cval=0
read -p "Enter value to convert : " tp
read -p "Enter current base of value : " cbase
read -p "Enter target base : " tbase
len=$((`echo $tp | wc -m`-1))

if [ $cbase -gt $lim ] || [ $tbase -gt $lim ] || [ $cbase -lt 2 ] || [ $tbase -lt 2 ]; then
	echo Parameters exceed valid limit
	exit 1
fi

i=0
while [ $i -lt $len ]; do
	dig=`echo $tp | cut -c$((len-i))`
	digval=`dec $dig $cbase`
	if [ $digval -lt 0 ]; then
		echo -e "Invalid digit in input value : $dig\n"
		exit 1
	fi
	cval=$((digval*cbase**i+cval))
	i=$((i+1))
done

ans=""
if [ $cval -eq 0 ]; then
	echo 0
else
	while [ $cval -gt 0 ]; do
		dig=$((cval%tbase))
		cval=$((cval/tbase))
		dig=`enc $dig $tbase`
		ans=$dig$ans
	done
	echo $ans
fi
