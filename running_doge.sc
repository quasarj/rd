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
format H 4 0 0
format I 4 0 0
format J 4 0 0
format K 4 0 0
define "" G55
define "agi" A57
define "assensing" G63
define "astral_combat" G60
define "attributes" A53
define "automatics" G57
define "bod" A56
define "cha" A63
define "computer" G61
define "con" G62
define "counterspelling" G58
define "damage_pool_mod" C44
define "detect_pool_mod" C50
define "drain_resist" A7
define "edge" A65
define "int" A62
define "karma" C81
define "log" A61
define "magic" A64
define "perception" G59
define "physical_mod" K13
define "play" A0
define "pool_mod" C38
define "qualities" C96
define "rea" A58
define "rolls" A10
define "spellcasting" G55
define "spells" A18
define "str" A59
define "stun_mod" K6
define "summoning" G56
define "wil" A60
color 1 = @white;@black
color 2 = @black;@blue
color 3 = @white;@green
color 8 = @black;@white
color A31:pool_mod 2
color A40:damage_pool_mod 2
color A46:detect_pool_mod 2
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
color A67:A67 3
color A67:karma 2
color A67:A67 3
color A83:C88 2
color A83:A83 3
color A90:qualities 2
color A90:A90 3
color spells:F29 2
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
leftstring H2 = "d"
let H2 = 1
let K2 = @sum(H2:J2)>2?-1:0
rightstring L2 = "d = drain damage"
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
leftstring H6 = "Left"
leftstring I6 = "%"
let I6 = 100-@sum(H2:J5)/I1*100
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
leftstring H9 = "n"
let H9 = 1
leftstring I9 = "n"
let I9 = 1
leftstring J9 = "n"
let J9 = 1
let K9 = @sum(H9:J9)>2?-1:0
rightstring L9 = "n = natural healing only"
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
leftstring H13 = "Left"
leftstring I13 = "%"
let I13 = 100-@sum(H9:J12)/I8*100
let physical_mod = @sum(K9:K12)
leftstring A14 = "Dtc Spells"
let B14 = spellcasting+magic+detect_pool_mod+pool_mod
leftstring A15 = "Dodge"
let B15 = rea+int+pool_mod
leftstring spells = "Spells"
leftstring C18 = "Drain"
leftstring D18 = "Class"
leftstring E18 = "Type"
leftstring F18 = "Dmg Type"
leftstring A19 = "Detect Enemies"
leftstring C19 = "F - 2"
leftstring D19 = "Detection"
leftstring F19 = "M"
leftstring A20 = "Detect Individual"
leftstring C20 = "F - 3"
leftstring D20 = "Detection"
leftstring F20 = "M"
leftstring A21 = "Detect Magic"
leftstring C21 = "F - 2"
leftstring D21 = "Detection"
leftstring F21 = "M"
leftstring A22 = "Mindlink"
leftstring C22 = "F - 1"
leftstring D22 = "Detection"
leftstring F22 = "M"
leftstring A23 = "Mind Probe"
leftstring C23 = "F"
leftstring D23 = "Detection"
leftstring F23 = "M"
leftstring A24 = "Clairaudience"
leftstring C24 = "F - 3"
leftstring D24 = "Detection"
leftstring F24 = "M"
leftstring A25 = "Stunball"
leftstring C25 = "F"
leftstring D25 = "Combat"
leftstring E25 = "Stunball"
leftstring F25 = "M"
leftstring A26 = "Lightning Bolt"
leftstring C26 = "F - 3"
leftstring D26 = "Combat"
leftstring E26 = "Indirect"
leftstring F26 = "P"
leftstring A27 = "Manabolt"
leftstring C27 = "F - 3"
leftstring D27 = "Combat"
leftstring E27 = "Direct"
leftstring F27 = "M"
leftstring A28 = "Increase Reflexes"
leftstring C28 = "F"
leftstring D28 = "Health"
leftstring F28 = "P"
leftstring A29 = "Heal"
leftstring C29 = "F - 4"
leftstring D29 = "Health"
leftstring F29 = "M"
leftstring A31 = "Active Pool Modifiers"
leftstring A32 = "Type"
leftstring C32 = "Amount"
leftstring A33 = "detect magic, f3"
let C33 = -2
leftstring A36 = "Stun Damage"
let C36 = stun_mod
leftstring A37 = "Physical Damage"
let C37 = physical_mod
rightstring A38 = "----------"
rightstring B38 = "Total"
let pool_mod = @sum(C33:C37)
leftstring A40 = "Damage Spell Pool Modifiers"
leftstring A41 = "Spell Focus"
let C41 = 3
rightstring A44 = "----------"
rightstring B44 = "Total"
let damage_pool_mod = @sum(C41:C43)
leftstring A46 = "Detect Spell Pool Modifiers"
leftstring A47 = "Spell Focus"
let C47 = 4
rightstring A50 = "----------"
rightstring B50 = "Total"
let detect_pool_mod = @sum(C47:C49)
leftstring attributes = "Attributes"
leftstring E53 = "Skills"
leftstring G53 = "Points"
leftstring A55 = "Current"
leftstring B55 = "Max"
leftstring E55 = "Spellcasting"
let spellcasting = 6
leftstring bod = "bod"
let bod = 4
let B56 = 6
leftstring E56 = "Summoning"
let summoning = 5
leftstring agi = "agi"
let agi = 3
let B57 = 7
leftstring C57 = "-1 leg brk"
leftstring E57 = "Automatics"
let automatics = 3
leftstring rea = "rea"
let rea = 5
let B58 = 6
leftstring E58 = "Counterspelling"
let counterspelling = 3
leftstring str = "str"
let str = 1
let B59 = 6
leftstring E59 = "Perception"
let perception = 3
leftstring wil = "wil"
let wil = 5
let B60 = 6
leftstring E60 = "Astral Combat"
let astral_combat = 2
leftstring log = "log"
let log = 3
let B61 = 6
leftstring E61 = "Computer"
let computer = 1
leftstring int = "int"
let int = 4
let B62 = 6
leftstring E62 = "Con"
let con = 2
leftstring cha = "cha"
let cha = 6
let B63 = 8
leftstring E63 = "Assensing"
let assensing = 3
leftstring magic = "magic"
let magic = 6
let B64 = 6
leftstring edge = "edge"
let edge = 4
let B65 = 6
leftstring A67 = "Karma"
leftstring B67 = "Type"
leftstring C67 = "Amount"
leftstring A68 = "Starting"
let C68 = 25
leftstring A69 = "Qualities"
leftstring B69 = "totaled"
let C69 = qualities
leftstring A70 = "dtc spell focus"
let C70 = -8
leftstring A71 = "dmg spell focus"
let C71 = -6
leftstring A72 = "Extra spell"
let C72 = -5
leftstring A74 = "Bonus Game 1"
let C74 = 8
leftstring A75 = "Bonus Game 2"
let C75 = 10
rightstring A81 = "Unspent"
let karma = @sum(C68:C80)
leftstring A83 = "Priority"
rightstring B83 = "Selection"
rightstring C83 = "Extra"
leftstring A84 = "A"
leftstring B84 = "Magic"
leftstring A85 = "B"
leftstring B85 = "Attributes"
let C85 = 20
leftstring A86 = "C"
leftstring B86 = "Race"
rightstring C86 = "Elf 3"
leftstring A87 = "D"
leftstring B87 = "Money"
let C87 = 50000
leftstring A88 = "E"
leftstring B88 = "Skills"
let C88 = 18
leftstring A90 = "Qualities"
leftstring B90 = "Rating"
leftstring C90 = "Karma"
leftstring A91 = "Focused Concentration"
let B91 = 3
let C91 = -12
leftstring A92 = "Ork Poser"
let C92 = 6
rightstring B96 = "Total"
let qualities = @sum(C91:C95)
goto bod A31
