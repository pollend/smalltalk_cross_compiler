| elements |
elements := #(24 54).

| max |
max := 0.
elements do:[:each | 
	(each > max) ifTrue: [
		max := each.
	]
].

| gcd |
gcd := 1.

1 to: max do: [:x |
	| hasRemainder |
	hasRemainder := false.
	elements do: [:each | 
		|temp|
		temp := each rem: x.
		temp == 0 ifFalse: [
			hasRemainder := true.
		].
	].
	(x > gcd & hasRemainder == false) ifTrue:[
		gcd := x.
	].	
	
].

Transcript show: gcd printString.
Transcript cr.
