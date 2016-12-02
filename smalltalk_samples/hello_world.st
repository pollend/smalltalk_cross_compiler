| output test |
output := 'Hello World'.
Transcript show: output; cr.

"Hello this is a comment"

( output == 'Hello World') ifTrue: [
    Transcript show: 'test'.
    ( output == 'Hello World') ifTrue: [
        Transcript show: 'test'.

    ].
    ( output == 'Hello World') ifTrue: [
        Transcript show: 'test'.

    ].
]
ifFalse: [
    Transcript show: 'test'.
].