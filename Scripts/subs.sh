n1=2.5
n2=3
echo "$n1 + $n2 = $((n1+n2))"
echo "$n1 - $n2 = $((n1-n2))"
echo "$n1 * $n2 = $((n1*n2))"
echo "$n1 / $n2 = $((n1/n2))"
echo "Using expr"
echo "$n1 + $n2 = $( expr $n1 + $n2 )"
echo "$n1 - $n2 = $( expr $n1 - $n2 )"
echo "$n1 * $n2 = $( expr $n1 \* $n2 )"
echo "$n1 / $n2 = $( expr $n1 / $n2 )"
