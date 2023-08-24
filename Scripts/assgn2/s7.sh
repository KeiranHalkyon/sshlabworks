#!/bin/bash

proc () {
	while :
	do
		#does nothing, is infinite
		echo $1
		sleep 1
	done
}

#process 1 and its pid
proc hi &
proc1_id=$!

#process 2 and its pid
proc bye &
proc2_id=$!

sleep 5
echo $proc1_id $proc2_id
kill $proc2_id
kill $proc1_id
