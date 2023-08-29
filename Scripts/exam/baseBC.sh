read -p "Enter value : " val
read -p "Enter input base : " ib
read -p "Enter output base : " ob
if [ $ib -lt 2 ] || [ $ob -lt 2 ]; then
	echo "Input/output base cannot be less than 2"
	exit 1
fi
if [ $ib -gt 16 ] || [ $ob -gt 16 ]; then
        echo "Input/output base cannot be greater than 16"
        exit 1
fi
val=`echo $val | tr [:lower:] [:upper:]`
echo "Output : "
echo "obase=$ob; ibase=$ib; $val" | bc
