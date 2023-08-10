echo -e "Enter file name:\c"
read f_name
if [ -e $f_name ]
then
	echo "$f_name : found"
	if [ -s $f_name ]
	then
		echo "It is non-empty"
	else
		echo "It is empty"
	fi
	if [ -x $f_name ]
	then
		echo "It is executable"
	else
		echo "It is not executable"
	fi
else
	echo "$f_name : not found"
fi

