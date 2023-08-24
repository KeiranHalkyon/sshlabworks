
echo "Enter a string : "
read text

word=$(echo -n "$text" | wc -w)
char=$(echo -n "$text" | wc -c)

space=$(expr length "$text" - length `echo "$text" | sed "s/ //g"`)
special=$(expr length "${text//[^\~!@#$&*()]/}")

echo "Number of words = $word"
echo "Number of characters = $char"
echo "Number of white spaces = $space"
echo "Number of special symbols = $special"
