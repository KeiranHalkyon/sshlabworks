read -p "Enter string : " str
read -p "Enter substring : " sub
rest=${str#*$sub}
echo $(( ${#str}-${#rest}- ${#sub} ))