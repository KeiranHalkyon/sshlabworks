fl="records.txt"

dispAll () {
	echo "Contents of $fl : "
	cat $fl
}

insert () {
	read -p "Enter name : " name
	read -p "Enter Dept : " dept
	read -p "Enter SGPA : " sgpa
	while : ;do
		read -p "Enter roll no. : " roll
		v=`grep $roll $fl` || break
		echo "Roll no. $roll already present. Enter new roll no."
	done
	echo "$roll|$name|$dept|$sgpa" >> $fl
}

del () {
	read -p "Enter roll no. to delete : " roll
	ln=`grep -v "^$roll|" $fl`
	#if [ $? -eq 0 ]; then
	#	ln=`echo $ln | cut -d: -f1`
	#	echo "Entry deleted"
	#	up=`head -n $((ln-1)) $fl`
	#	flc=`wc -l $fl | cut -d' ' -f1`
	#	dn=`tail -n $((flc-ln)) $fl`
	#	echo "$up---"
	#	echo "$dn"
	#else
	#	echo "Entry not found"
	#fi
	echo "Entry deleted"
	echo "$ln" > "$fl"
}

update () {
	read -p "Enter roll no. to update : " roll
	ln=`grep -n "^$roll|" $fl`
	if [ $? -eq 1 ]; then
		echo "$roll not found"
	else
		read -p "Enter new name : " name
	        read -p "Enter new Dept : " dept
	        read -p "Enter new SGPA : " sgpa
		v=`echo $ln | cut -d: -f1`
		up=$(head -n $(expr $v - 1) $fl)
		flc=`wc -l $fl | cut -d' ' -f1`
		down=$(tail -n $(expr $flc - $v) $fl)
		
		echo "$up" > "$fl"
		echo "$roll|$name|$dept|$sgpa" >> $fl
		echo "$down" >> $fl
		echo "Entry updated"
	fi
}

while : ; do
	echo -e "1) Display all records\n2) Insert new record\n3) Delete by roll no.\n4) Update by roll no.\n5) Exit"
	read -p "Enter : " ch
	case $ch in
		1) dispAll
		;;
		2) insert
		;;
		3) del
		;;
		4) update
		;;
		5) echo "Exiting"
		exit 0
		;;
		*)
		echo "Invalid input"
		;;
	esac
done
