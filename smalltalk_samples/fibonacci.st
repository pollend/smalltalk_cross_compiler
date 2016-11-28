| iterations |
iterations := 3.


|previous next |
previous := 1.
next := 1.

Transcript show: previous printString; cr.
Transcript show: next printString; cr.

iterations timesRepeat:[ 
	| temp |
	temp := previous + next.
	previous := next.
	next := temp.
	Transcript show: temp printString; cr.
].