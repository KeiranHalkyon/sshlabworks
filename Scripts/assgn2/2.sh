read -p "Enter string : " str
rev=""
len=${#str}
for (( i = $len-1; i>=0 ; i-- ))
do
	rev+=${str:i:1}
done
if [ $str == $rev ]
then
	echo It is a palindrome
else
	echo It is not a palindrome
fi
