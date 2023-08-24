echo "Enter the three numbers : "
read -a arr
echo "All possible combinations : "
for i in ${arr[0]} ${arr[1]} ${arr[2]}
do	
	for j in ${arr[0]} ${arr[1]} ${arr[2]}
	do
		for k in ${arr[0]} ${arr[1]} ${arr[2]}
		do
			echo $i $j $k
		done
	done
done