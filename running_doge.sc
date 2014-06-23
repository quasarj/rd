# This data file was generated by the Spreadsheet Calculator.
# You almost certainly shouldn't edit it.

set color
format A 10 0 0
format B 10 0 0
format C 10 0 0
format D 10 0 0
format E 10 0 0
format F 10 0 0
format G 10 0 0
define "" F86
define "agi" A88
define "assensing" F94
define "astral_combat" F91
define "attributes" A84
define "automatics" F88
define "bod" A87
define "cha" A94
define "computer" F92
define "con" F93
define "counterspelling" F89
define "damage_pool_mod" C66
define "detect_pool_mod" C72
define "drain_resist" A7
define "edge" A96
define "int" A93
define "karma" C115
define "log" A92
define "magic" A95
define "perception" F90
define "physical_mod" K13
define "play" A0
define "pool_mod" C60
define "qualities" C130
define "rea" A89
define "rolls" A10
define "spellcasting" F86
define "spells" A32
define "str" A90
define "stun_mod" K6
define "summoning" F87
define "wil" A91
color 1 = @white;@black
color 2 = @black;@blue
color 3 = @white;@green
color 8 = @black;@white
color A53:pool_mod 2
color A62:damage_pool_mod 2
color A68:detect_pool_mod 2
color rolls:rolls 3
color H2:J4 3
color H2:J4 4
color H5:I5 4
color J5:J5 8
color H9:J11 4
color H12:H12 4
color I12:J12 8
color H1:H1 2
color H1:H1 3
color H8:H8 3
color A101:A101 3
color A101:karma 2
color A101:A101 3
color A117:C122 2
color A117:A117 3
color A124:qualities 2
color A124:A124 3
color spells:F43 2
color spells:spells 3
label play = "RD"
leftstring H1 = "Stun Track"
let I1 = @rnd(wil/2+8)
leftstring K1 = "Pool mod"
rightstring L1 = "Notes"
leftstring A2 = "Initiative"
rightstring B2 = "val"
rightstring C2 = "roll"
rightstring D2 = "bonus"
leftstring H2 = "drain"
let H2 = 1
let K2 = @sum(H2:J2)>2?-1:0
rightstring A3 = "Normal"
let B3 = rea+int
rightstring C3 = "1D6"
rightstring D3 = "3 + 1D6"
leftstring E3 = "from improved reflexes"
let K3 = @sum(H3:J3)>2?-1:0
rightstring A4 = "Astral"
let B4 = int*2
rightstring C4 = "2D6"
rightstring D4 = "3 + 1D6"
let K4 = @sum(H3:J3)>2?-1:0
let K5 = @sum(H4:J4)>2?-1:0
leftstring A6 = "Drain Resist"
leftstring C6 = "Edge"
leftstring E6 = "Limits"
leftstring H6 = "SP Left"
leftstring I6 = "%"
let I6 = 100-@sum(H2:J5)/I1*100
rightstring J6 = "Total"
let stun_mod = @sum(K2:K5)
let drain_resist = wil+cha+pool_mod
leftstring C7 = "Max"
let C7 = edge
rightstring E7 = "Physical"
label F7 = "?"
leftstring C8 = "Cur"
let C8 = 4
rightstring E8 = "Mental"
label F8 = "?"
leftstring H8 = "Phys Track"
let I8 = bod/2+8
leftstring K8 = "Pool mod"
rightstring L8 = "Notes"
rightstring E9 = "Social"
label F9 = "?"
leftstring H9 = "nat"
let H9 = 1
leftstring I9 = "nat"
let I9 = 1
leftstring J9 = "nat"
let J9 = 1
let K9 = @sum(H9:J9)>2?-1:0
leftstring rolls = "Rolls"
let K10 = @sum(H10:J10)>2?-1:0
leftstring A11 = "Perception"
let B11 = perception+int+pool_mod
let K11 = @sum(H11:J11)>2?-1:0
leftstring A12 = "Spells"
let B12 = spellcasting+magic+pool_mod
let K12 = @sum(H12:J12)>2?-1:0
leftstring A13 = "Dmg Spells"
let B13 = spellcasting+magic+damage_pool_mod+pool_mod
leftstring H13 = "HP Left"
leftstring I13 = "%"
let I13 = 100-@sum(H9:J12)/I8*100
rightstring J13 = "Total"
let physical_mod = @sum(K9:K12)
leftstring A14 = "Dtc Spells"
let B14 = spellcasting+magic+detect_pool_mod+pool_mod
leftstring A15 = "Dodge"
let B15 = rea+int+pool_mod
leftstring spells = "Spells"
leftstring C32 = "Drain"
leftstring D32 = "Class"
leftstring E32 = "Type"
leftstring F32 = "Dmg Type"
leftstring A33 = "Detect Enemies"
leftstring C33 = "F - 2"
leftstring D33 = "Detection"
leftstring F33 = "M"
leftstring A34 = "Detect Individual"
leftstring C34 = "F - 3"
leftstring D34 = "Detection"
leftstring F34 = "M"
leftstring A35 = "Detect Magic"
leftstring C35 = "F - 2"
leftstring D35 = "Detection"
leftstring F35 = "M"
leftstring A36 = "Mindlink"
leftstring C36 = "F - 1"
leftstring D36 = "Detection"
leftstring F36 = "M"
leftstring A37 = "Mind Probe"
leftstring C37 = "F"
leftstring D37 = "Detection"
leftstring F37 = "M"
leftstring A38 = "Clairaudience"
leftstring C38 = "F - 3"
leftstring D38 = "Detection"
leftstring F38 = "M"
leftstring A39 = "Stunball"
leftstring C39 = "F"
leftstring D39 = "Combat"
leftstring E39 = "Stunball"
leftstring F39 = "M"
leftstring A40 = "Lightning Bolt"
leftstring C40 = "F - 3"
leftstring D40 = "Combat"
leftstring E40 = "Indirect"
leftstring F40 = "P"
leftstring A41 = "Manabolt"
leftstring C41 = "F - 3"
leftstring D41 = "Combat"
leftstring E41 = "Direct"
leftstring F41 = "M"
leftstring A42 = "Increase Reflexes"
leftstring C42 = "F"
leftstring D42 = "Health"
leftstring F42 = "P"
leftstring A43 = "Heal"
leftstring C43 = "F - 4"
leftstring D43 = "Health"
leftstring F43 = "M"
leftstring A53 = "Active Pool Modifiers"
leftstring A54 = "Type"
leftstring C54 = "Amount"
leftstring A55 = "detect magic, f3"
let C55 = -2
leftstring A58 = "Stun Damage"
let C58 = stun_mod
leftstring A59 = "Physical Damage"
let C59 = physical_mod
rightstring A60 = "----------"
rightstring B60 = "Total"
let pool_mod = @sum(C55:C59)
leftstring A62 = "Damage Spell Pool Modifiers"
leftstring A63 = "Spell Focus"
let C63 = 3
rightstring A66 = "----------"
rightstring B66 = "Total"
let damage_pool_mod = @sum(C63:C65)
leftstring A68 = "Detect Spell Pool Modifiers"
leftstring A69 = "Spell Focus"
let C69 = 4
rightstring A72 = "----------"
rightstring B72 = "Total"
let detect_pool_mod = @sum(C69:C71)
leftstring attributes = "Attributes"
leftstring D84 = "Skills"
leftstring F84 = "Points"
leftstring A86 = "Current"
leftstring B86 = "Max"
leftstring D86 = "Spellcasting"
let spellcasting = 6
leftstring bod = "bod"
let bod = 4
let B87 = 6
leftstring D87 = "Summoning"
let summoning = 5
leftstring agi = "agi"
let agi = 3
let B88 = 7
leftstring C88 = "-1 leg brk"
leftstring D88 = "Automatics"
let automatics = 3
leftstring rea = "rea"
let rea = 5
let B89 = 6
leftstring D89 = "Counterspelling"
let counterspelling = 3
leftstring str = "str"
let str = 1
let B90 = 6
leftstring D90 = "Perception"
let perception = 3
leftstring wil = "wil"
let wil = 5
let B91 = 6
leftstring D91 = "Astral Combat"
let astral_combat = 2
leftstring log = "log"
let log = 3
let B92 = 6
leftstring D92 = "Computer"
let computer = 1
leftstring int = "int"
let int = 4
let B93 = 6
leftstring D93 = "Con"
let con = 2
leftstring cha = "cha"
let cha = 6
let B94 = 8
leftstring D94 = "Assensing"
let assensing = 3
leftstring magic = "magic"
let magic = 6
let B95 = 6
leftstring edge = "edge"
let edge = 4
let B96 = 6
leftstring A101 = "Karma"
leftstring B101 = "Type"
leftstring C101 = "Amount"
leftstring A102 = "Starting"
let C102 = 25
leftstring A103 = "Qualities"
leftstring B103 = "totaled"
let C103 = qualities
leftstring A104 = "dtc spell focus"
let C104 = -8
leftstring A105 = "dmg spell focus"
let C105 = -6
leftstring A106 = "Extra spell"
let C106 = -5
leftstring A108 = "Bonus Game 1"
let C108 = 8
leftstring A109 = "Bonus Game 2"
let C109 = 10
rightstring A115 = "Unspent"
let karma = @sum(C102:C114)
leftstring A117 = "Priority"
rightstring B117 = "Selection"
rightstring C117 = "Extra"
leftstring A118 = "A"
leftstring B118 = "Magic"
leftstring A119 = "B"
leftstring B119 = "Attributes"
let C119 = 20
leftstring A120 = "C"
leftstring B120 = "Race"
rightstring C120 = "Elf 3"
leftstring A121 = "D"
leftstring B121 = "Money"
let C121 = 50000
leftstring A122 = "E"
leftstring B122 = "Skills"
let C122 = 18
leftstring A124 = "Qualities"
leftstring B124 = "Rating"
leftstring C124 = "Karma"
leftstring A125 = "Focused Concentration"
let B125 = 3
let C125 = -12
leftstring A126 = "Ork Poser"
let C126 = 6
rightstring B130 = "Total"
let qualities = @sum(C125:C129)
goto A18 play
