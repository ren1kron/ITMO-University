org 0x20
clear:
	ld #0x0B ; 0
    out 0x14
    
    ld #0x1B ; 1
    out 0x14

    ld #0x2B ; 2
    out 0x14

    ld #0x3B
    out 0x14

    ld #0x4B
    out 0x14

    ld #0x5b
    out 0x14
    ret

org 0x50

res: word 0
r: word ?
;rr: word ?

negative1: word ?
negative2: word ?
input: word ?
input2: word ?

thousand: word 1000
hundred: word 100
ten: word 10
;one: word 1



start:
	call clear
	cla
	st res ; очищаем результат
	st negative1
	st negative2
	s1: in 0x1d
	and #0x40
	beq s1
	in 0x1c

;	out 0x14
	cmp #0xa
	bne metka
	st negative1
	jump s1
	metka: st input

	s2: in 0x1d
	and #0x40
	beq s2
	in 0x1c

;	out 0x14
	cmp #0xD
	beq n1
	st r
	ld input
	asl
	asl
	asl
;	asl
	add input
	add input
	add r
	st input
	cla
	st r

	wait_multiply: in 0x1d
	and #0x40
	beq wait_multiply
	in 0x1c

	cmp #0xd
	bne wait_multiply
;	beq n1
;	jump wait_multiply

	n1: in 0x1d
	and #0x40
	beq n1
	in 0x1c

;	out 0x14
;	cmp #0
;	beq n_eq_0
	cmp #0xa
	bne metka2
	st negative2
	jump n1
	metka2: st input2

	n2: in 0x1d
	and #0x40
	beq n2
	in 0x1c

;	out 0x14
	cmp #0xf
;	beq calc
	beq chk0
	st r
	ld input2
	asl
	asl
	asl
;	asl
	add input2
	add input2
	add r
	st input2
	cla
	st r

	wait_equals: in 0x1d
	and #0x40
	beq wait_equals
	in 0x1c

;	out 0x14
	cmp #0xf
	bne wait_equals
	cla
	st res
	chk0: ld input
	cmp #0
	bne chk0_2
	out 0x14
	jump stop

	chk0_2: ld input2
	cmp #0
	bne calc
	out 0x14
	jump stop


	calc: ld res
	add input
	st res
	loop input2
	jump calc
;	jump count1000
;	n_eq_0: cla
;	out 0x14
;	jump stop

	count1000: 
	ld res
	cmp thousand 
	
	blt count100 
	
	sub thousand 
	st res
	ld thds
	inc
	st thds
	jump count1000

	count100:
	ld res
	cmp hundred
	blt count10
	sub hundred
	st res
	ld hnds
	inc
	st hnds
	jump count100

	count10:
	ld res
	cmp ten
	blt ld_units
	sub ten
	st res
	ld tens
	inc
	st tens
	jump count10

	ld_units: ;cla
	ld res
	st units


	cla
	st negative
	ld negative1
	cmp negative2
	beq counting_digits
	ld #0xa
	st negative

	counting_digits: ld #4
	st max_digit
	
	ld thds
	cmp #0
	beq dec_max1
	add pos3
	st thds
	jump set2

	dec_max1: ld max_digit
	dec
	st max_digit
	ld hnds
	cmp #0
	beq dec_max2
	add pos2
	st hnds
	jump set1

	dec_max2: ld max_digit
	dec
	st max_digit
	ld tens
	cmp #0
	beq dec_max3
	add pos1
	st tens
	jump making_sign

	dec_max3: ld max_digit
	dec
	st max_digit
	jump making_sign

	set2: ld hnds
	or pos2
	st hnds
	set1: ld tens
	or pos1
	st tens
	
	making_sign: ld negative
	cmp #0
	beq outputting
	ld max_digit
	; 0001
	asl
	asl
	asl
	asl
	; 1 0000
;	ld #0070
	or negative
	st negative
	out 0x14
	
	outputting: 
;	ld #0x0B ; 0
;    out 0x14
;    
;    ld #0x1B ; 1
;    out 0x14
;
;    ld #0x2B ; 2
;    out 0x14
;
;    ld #0x3B
;    out 0x14
;
;    ld #0x4B
;    out 0x14
    
		ld units
;		cmp #0
;		bne ld1
		out 0x14
		
		ld1: ld tens
		cmp #0
;		bne ld_N
;		beq ld_N
		beq stop
		out 0x14
		
		ld2: ld hnds
		cmp #0
;		bne ld_N
;		beq ld_N
		beq stop
		out 0x14
		
		ld3: ld thds
		cmp #0
;		bne ld_N
;		beq ld_N
		beq stop
		out 0x14
		
;		ld_N: ld negative
;		cmp #0
;;		bne stop
;		beq stop
;		out 0x14

	stop: cla
	st units
	st tens
	st hnds
	st thds
	st negative
	hlt


negative: word ?
thds: word ?
hnds: word ?
tens: word ?
units: word ?

max_digit: word ?

pos4: word 0x0040
pos3: word 0x0030
pos2: word 0x0020
pos1: word 0x0010


	
	
	
