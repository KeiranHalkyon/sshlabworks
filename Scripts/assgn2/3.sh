read -p "Enter file name : " file
read -p "Enter starting line : " start
read -p "Enter the number of lines to be displayed : " num
tail -n +$start $file | head -n $num
