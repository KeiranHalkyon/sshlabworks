read -p "Enter 1 for number of presently active users, 2 for displaying lines from top or 3 for updating access time of a file : " choice
case $choice in 
	1) who
	;;
	2) read -p "Enter file name : " file
	   read -p "Enter number of lines to be displayed : " num
	   head -n $num $file
	;;
	3) read -p "Enter file name : " file
	   touch -a $file
           stat $file
	;;
	*) echo "Invalid option"
esac 

