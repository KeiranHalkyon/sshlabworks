echo "Enter the two numbers : "
read num1 num2
for (( i=1; i<=num1 && i<=num2; i++ ))
do
	if [ $((num1%i)) -eq 0 ] && [ $((num2%i)) -eq 0 ]
	then
		gcd=$i
	fi
done
echo "The gcd of $num1 and $num2 is $gcd"