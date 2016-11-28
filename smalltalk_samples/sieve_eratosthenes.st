| size items|
size := 1000.
items := OrderedCollection new.



2 to: size do: [:x |
	items add: x.
].


| square |
square := size sqrt.
square := square ceiling.

2 to: square do: [:x |
	| temp |
	temp := x.

	(items includes: x) ifTrue:[
		Transcript show: x printString.
		Transcript cr.
	].	

	[temp <= size] whileTrue:[ 
		(items includes: temp) ifTrue:[
			items remove: temp.
		].	
		temp := temp + x.

	].

].

items do: [:each | 
	Transcript show: each printString.
	Transcript cr.
].