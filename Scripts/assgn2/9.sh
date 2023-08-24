echo "Enter the numbers : "
read -a arr
echo "The original array : ${arr[@]}"
read -p "Enter the index number to be deleted : " index
unset arr[$index]
echo "The array : ${arr[@]}"
