echo -e "Enter file name:\c"
read f_name
if [ -f $f_name ]
then
	if [ -w $f_name ]
	then
		echo "Enter data. CTRL+D to exit"
		cat >> $f_name
	else
		echo "No write permission"
	fi
else
	echo "File does not exist"
fi

