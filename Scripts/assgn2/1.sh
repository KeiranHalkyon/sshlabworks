read -p "Enter 1 for merging or 2 for pattern : " choice
case $choice in 
	1) cat file1.sh file2.sh > file3.sh
	;;
	2) grep "what" file1.sh
	;;
	*) echo "Invalid option"
esac 

