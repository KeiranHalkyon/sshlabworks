echo "Enter the numbers : "
read -a arr
n=${#arr[@]}
echo "The original array : ${arr[@]}"
for (( i=0; i<n-1; i++ ))
	do
	for (( j=0; j<$n-i-1; j++ ))
		do
		if [  ${arr[$j]} -lt ${arr[$((j+1))]} ]
			then
			temp=${arr[$j]}
			arr[$j]=${arr[$((j+1))]}
			arr[$((j+1))]=$temp
		fi
		done
	done
echo "Descending order : ${arr[@]}"
