read -p "Enter a word : " str
echo "|$str|"
len=$((`echo $str | wc -m`-1 ))
i=0
while [ $i -lt $((len/2)) ]
do
	if [ ! `echo $str | cut -c $((i+1))` = `echo $str | cut -c $((len-i))` ]
	then
		echo "Not Palindrome"
		exit 0
	fi
	i=$((i+1))
done
echo "Palindrome"
