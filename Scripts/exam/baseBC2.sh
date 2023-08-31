#./baseConv.sh val ibase obase

val=$1
ib=$2
ob=$3
ib=`echo $ib | tr [:lower:] [:upper:]`
ob=`echo $ob | tr [:lower:] [:upper:]`
val=`echo $val | tr [:lower:] [:upper:]`

if [ `echo "$ib<2" | bc` -eq 1 ] || [ `echo "$ob<2" | bc` -eq 1 ]; then
        echo "Input or output base cannot be less than 2"
        exit 1
fi

if [ `echo "$ib>16" | bc` -eq 1 ] || [ `echo "$ob>16" | bc` -eq 1 ]; then
        echo "Input or Output base cannot be greater than 16"
        exit 1
fi

len=$((`echo $val | wc -m`-1))
i=1
while [ $i -le $len ]; do
        nc=`echo $val | cut -c$i`
        if [ ! $nc = '-' ]; then
                if [ `echo "$nc<$ib" | bc` -eq 0 ]; then
                        echo "Error : Greater than input base : $nc"
                        exit 1
                fi
        fi
	i=$((i+1))
done
echo "Output:"
echo "obase=$ob; ibase=$ib; $val" | bc

