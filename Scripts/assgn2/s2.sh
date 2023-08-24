#!/bin/bash

echo "Enter a string: "
read input_string

# Reverse the string
reversed_string=$(echo "$input_string" | rev)

if [ "$input_string" = "$reversed_string" ]; then
    echo "Palindrome"
else
    echo "Not a palindrome"
fi
