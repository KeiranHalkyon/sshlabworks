echo "Enter 3 names : "
read name1 name2 name3
echo The names are $name1, $name2, $name3
echo Reading at same line
read -p "Username : " uname
echo $uname
read -sp "Password : " pword
echo -e "\n"$pword
read -a ar1
echo "Contents : ${ar1[0]} ${ar1[1]}"
echo "Enter names"
read
echo "names:$REPLY"
