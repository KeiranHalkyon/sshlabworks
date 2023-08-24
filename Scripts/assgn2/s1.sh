echo -e "1. Merge two files\n2. Search for a pattern in a file\n"
read -p "Enter choice : " ch
case $ch in 
	1)
	echo "Enter 2 file names"
	read f1 f2
	if !([ -f "$f1" ] && [ -f "$f2" ])
	then
		echo "Files dont exist"
		exit 0
	fi
	read -p "Enter output file name : " f3
	cat "$f1" "$f2" > "$f3"
	echo "Copied"
	;;
	2)
	echo "Enter filename : "
	read f1
	if ! [ -f "$f1" ]
	then
		echo "File doesn't exist"
		exit 0
	fi
	echo "Enter pattern : "
	read patt
	echo $(grep "$patt" "$f1")
	echo -e "Command executed\n"
	;;
	*)
	echo -e "Invalid Option\n"
esac
