Object subclass: #Hanoi.

Hanoi extend [
	| index |
	init [
		index := 0
	]
    moveTower:height fromPole:fromPole toPole:toPole withPole:withPole  [
    	(height >= 1) ifTrue:[
    		self moveTower: height-1 fromPole:fromPole toPole:withPole withPole:toPole.
    		self moveDisk: fromPole toPole:toPole.
    		self moveTower: height-1 fromPole:withPole toPole:toPole withPole:fromPole.
    	].
    ]

    moveDisk:fromPole toPole:toPole[
    	index := index + 1.

    	Transcript show: index printString.
		Transcript show: ': '.
		Transcript show: fromPole.
		Transcript show: ' '.
		Transcript show: toPole.
		Transcript cr.
	]
].

h := (Hanoi new).
h init.
h moveTower:3 fromPole:'1' toPole:'2' withPole:'3' 
