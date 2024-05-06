org: 0x32D
str: word 0x0563
pointer: word ?
stop_sym: word 0x000D

start: cla
ld str
st pointer 

s1: in 3
and #0x40
beq s1
ld (str)
out 2
sxtb
cmp stop_sym
beq phlt

s2: in 3
and #0x40
beq s2
ld (str)+
swab
out 2
sxtb
cmp stop_sym
beq phlt
jump s1


phlt: hlt
org 0x563
WORD 0xD0F3 ; Сп
WORD 0xD3C1 ; ас
WORD 0xD4C9 ; ит
WORD 0x9AC5 ; е 
WORD 0xD4D3 ; ст
WORD 0xC4D5 ; уд
WORD 0xCEC5 ; ен
WORD 0xCFD4 ; то
WORD 0x9AD7 ; в 
WORD 0xC6E1 ; Аф
WORD 0xCEC1 ; ан
WORD 0xD3C1 ; ас
WORD 0xC5D8 ; ье
WORD 0xC1D7 ; ва
word 0x0D21

