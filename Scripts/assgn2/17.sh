read -p "Enter the value of n : " n
a=0
b=1
echo "The fibonacci series : "
for (( i=0 ; i<n; i++ ))
do
	echo "$a"
	c=$((a+b))
	a=$b
	b=$c
done
