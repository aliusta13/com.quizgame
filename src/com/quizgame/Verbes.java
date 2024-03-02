package com.quizgame;

public class Verbes {


    String [] str= {"ABUSER",//1
                    "ABRUTIR",//2
                    "ACCEPTER",//3
                    "ACCOMPAGNER",//4
                    "ACCOMPLIR",//5
                    "ACCUSER",//6
                    "ACHETER",//7
                    "ACHEVER",//8
                    "ACTUALISER",//9
                    "ADMETTRE",//10
                    "ADMIRER",//11
                    "ADORER",//12
                    "ADRESSER",//13
                    "ADVENIR",//14
                    "AFFECTER",//15
                    "AFFRANCHIR",//16
                    "ADJOINDRE",//17
                    "AFFICHER",//18
                    "AFFIRMER",//19
                    "AGRESSER",//20
                    "AIDER",// 21
                    "AMENER",// 22
                    "APAISER",// 23
                    "APPARTENIR",// 24
                    "APPORTER",// 25
                    "APPROCHER",// 26
                    "APPROUVER",// 27
                    "ARRANGER",// 28
                    "ASSISTER",// 29
                    "ASSURER",// 30
                    "ATERRIR",// 31
                    "AVOUER",// 32
                    "BASER",// 33
                "BAVARDER",// 34
                "BOIRE",// 35
                "CACHER",// 36
                "CALCULER",// 37
                "CAPTER",// 38
                "CARESSER",// 39
                "CAUSER",// 40
                "CHANGER",// 41
                "CHARGER",// 42
                "CHOPER",// 43
                "CLASSER",// 44
                "COMMANDER",// 45
                "COMMETTRE",// 46
                "COMPARER",// 47
                "COMPORTER",// 48
                "COMPTER",// 49
                "CONCLURE",// 50
                "CONFIRMER",// 51
                "CONSOLER",// 52
                "CONTENIR",// 53
                "CORROBORER",// 54
                "ABORDER",// 55
                "ABOYER",// 56
                "ABUSER",// 57
                "ABIMER",// 58
                "ACCENTUER",// 59
                "ACCOMPLIR",// 60
                "ACCORDER",// 61
                "ACCROCHER",// 62
                "ACCUSER",// 63
                "ADMETTRE",// 64
                "ADVENIR",// 65
                "AJOUTER",// 66
                "ALLER",// 67
                "ALLUMER",// 68
                "AMENER",// 69
                "AMPLIFIER",// 70
                "AMUSER",// 71
                "APAISER",// 72
                "APERCEVOIR",// 73
                "APPARTENIR",// 74
                "APPRECIER",// 75
                "ARRACHER",// 76
                "ASPIRER",// 77
                "ASSEMBLER",// 78
                "ASSISTER",// 79
                "ATTEINDRE",// 80
                "ATTRIBUER",// 81
                "AVERTIR",// 82
                "AVOUER",// 83
                "BAISSER",// 84
                "BOITER",// 85
                "BENEFICIER",// 86
                "CACHER",// 87
                "CALCULER",// 88
                "CAPITALISER",// 89
                "CAPTER",// 90
                "CERNER",// 91
                "CHANGER",// 92
                "CHARGER",// 93
                "CITER",// 94
                "COCHER",// 95
                "COLLABORER",// 96
                "COMPENSER",// 97
                "SE COMPORTER",// 98
                "COMPROMETTRE",// 99
                "CONCERNER",// 100
            "CONCEVOIR",//101
            "CONCLURE",//102
            "CONDAMNER",//103
            "CONFIRMER",//104
            "CONSACRER",//105
            "CONSEILLER",//106
            "CONSERVER",//107
            "CONSIDERER",//108
            "CONSISTER",//109
            "CONSOLER",//110
            "CONSULTER",//111
            "CONTENIR",//112
            "CONVAINCRE",//113
            "CORROBORER",//114
            "COULER",//115
            "CRACHER",//116
            "CULTIVER",//117
            "ALLER",//118
            "DATER",//119
            "DEVENIR",//120
            "DEVINER",//121
            "DEVOIR",//122
            "DIFFUSER",//123
            "DIFFERENCIER",//124
            "DIMINUER",//125
            "DIRIGER",//126
            "DISCUTER",//127
            "DISPENSER",//128
            "DISPUTER",//129
            "DISTRIBUER",//130
            "DIVISER",//131
            "DOPER",//132
            "DOTER",//133
            "DOUTER",//134
            "DURCIR",//135
            "DECEVOIR",//136
            "DEFENDRE",//137
            "DEFONCER",//138
            "DEPANNER",//139
            "DENONCER",//140
            "DESESPERER",//141
            "DESOBEIR",//142
            "DETACHER",//143
            "DETERMINER",//144
            "EFFACER",//145
            "EFFECTUER",//146
            "EMBALLER",//147
            "EMBAUCHER",//148
            "EMMENER",//149
            "EMPORTER",//150
            "EMPRUNTER",//151
            "ENLEVER",//152
            "ENTOURER",//153
            "ENTREPRENDRE",//154
            "EXAMINER",//155
            "EXCELLER",//156
            "EXIGER",//157
            "EXISTER",//158
            "EXPRIMER",//159
            "EXPULSER",//160
            "EXECUTER",//161
            "FACILITER",//162
            "FAILLIR",//163
            "FAVORISER",//164
            "FILER",//165
            "FINALISER",//166
            "FONCER",//167
            "FONCTIONNER",//168
            "FONDER",//169
            "GRIMPER",//170
            "HAUSSER",//171
            "HONORER",//172
            "HUMILIER",//173
            "HATER",//174
            "IGNORER",//175
            "IMITER",//176
            "IMPARTIR",//177
            "IMPOSER",//178
            "INSISTER",//179
            "INSPIRER",//180
            "INTERAGIR",//181
            "INTERDIRE",//182
            "INTERROGER",//183
            "INTERVENIR",//184
            "INTRODUIRE",//185
            "INVENTER",//186
            "INVERSER",//187
            "INVITER",//188
            "JOINDRE",//189
            "LIMITER",//190
            "LIVRER",//191
            "LOUPER",//192
            "MENER",//193
            "NIER",//194
            "OBLIGER",//195
            "OBSERVER",//196
            "OBTENIR",//197
            "OSER",//198
            "PARTICIPER",//199
            "PARVENIR",//200
            "PERCEVOIR",//201
            "PERMETTRE",//202
            "PLANIFIER",//203
            "POSTULER",//204
            "PROCURER",//205
            "PROFITER",//206
            "PROLONGER",//207
            "PROMETTRE",//208
            "PROPOSER",//209
            "PROUVER",//210
            "PROVENIR",//211
            "PREVOIR",//212





    };

}