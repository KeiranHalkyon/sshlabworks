read -p "Enter the number : " num
len=${#num}
n=$num
while [ $n -gt 0 ]
do
	d=$((n % 10))
        sum=$((sum + d**len))
        n=$((n/10))
done
if [ $sum -eq $num ]
then
	echo "It is an Armstrong number"
else
	echo "It is not an Armstrong number"
fi