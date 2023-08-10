n1=2.5
n2=3
echo "$n1+$n2" | bc
echo "$n1-$n2" | bc
echo "scale=2;$n1*$n2" | bc
echo "scale=5;$n1/$n2" | bc
echo "$n1%$n2" | bc

