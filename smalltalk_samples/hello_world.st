| output test |
output := 'Hello World'.
Transcript show: output; cr.

( output == 'Hello World') ifTrue: [
    Transcript show: 'test'.

].