echo -e "1. Merge two files\n2. Search for a pattern in a file\n"
read -p "Enter choice : " ch
case $ch in 
	1)
	echo "Enter 2 file names"
	read f1 f2
	if ! [ -f "$f1" && -f "$f2" ]
	then
		echo "Files dont exist"
	fi
	read -p "Enter output file name : " f3
	cat "$f1" "$f2" >  "$f3"
	echo "Copied"
	;;
	2);;
esac
