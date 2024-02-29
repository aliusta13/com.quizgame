package com.quizgame;

public class LisezLesExplication {

     /*

        Un quiz sur 212 verbes français différents.
        212 définitions (en turc ou en ftançais) différentes sont données par une "liste d'array" nommée "definitionsListe"
        et les verbes correspondants sont formés par une "liste d'array" nommée "verbeList".

        Le nombre de questions peut être augmenté en ajoutant
        aux listes d'array nommées "definitionsListe" et "verbesListe".

        le but du jeu est de donner à l'utilisateur une définition
        et de trouver le verbe qui correspond à cette définition

        L'utilisateur choisit le nombre de questions pour le quiz, compris entre 5 et 15.

        l'utilisateur peut demander des indices afin de trouver la bonne réponse
        (si vous souhaitez obtenir un indice, appuyez sur 1, sinon, appuyez sur n'importe quel bouton)
        les trois premiers indices forment les trois premières lettres du verbe,
        mais les indices suivants peuvent être n'importe quelle lettre après la 3e lettre

        l'utilisateur peut faire un maximum de 6 tentatives
        et si l'utilisateur ne connaît pas la réponse en 6 tentatives,
        la réponse est annoncée et 30 points supplémentaires sont déduits de l'utilisateur...

        (Par exemple, si l'utilisateur fait 6 tentatives sans aucune aide,
        pour cette question, à cause de chaque tentative incorrecte, le score sera réduit à 0.
        Et l'utilisateur recevra -30 points supplémentaires parce que la réponse à la question a été révélée,
        de sorte que l'utilisateur recevra -30 points pour cette question au totale.

        si l'utilisateur reçoit de l'aide à chaque fois
        et qu'il ne parvient toujours pas à répondre correctement à la question,
        il recevra -60 points pour une question (le score le plus bas possible).
        le score maximum possible pour une question est de 50 points.
        par exemple, l'utilisateur peut obtenir entre 250 et -300 points dans un quiz de 5 questions)

        ...et passer à la question suivante.
        le score est ajouté au score total avant de passer à la question suivante.
        le score de la question est affiché lors du passage à la question suivante,
        mais le score total est affiché à l'utilisateur à la fin du jeu.

        à chaque fois qu'une nouvelle question est passée, que la réponse soit correcte ou non,
        la définition et sa réponse sont supprimées des listes d'array,
        ce qui évite la répétition de la question.



         */

        /*
                               UN RESUME EN FRANCAIS
        Le code que j'ai  partagé est un programme en Java qui
        met en œuvre un jeu de quiz de française.
        Voici un résumé de son fonctionnement :

        1. Le programme crée deux listes : une liste de verbes (verbesList) et
           une liste de leurs définitions correspondantes (definitionsList).
        2. L'utilisateur choisit le nombre de questions pour le quiz, compris entre 5 et 15.
        3. Pour chaque question dans le nombre défini par l'utilisateur :
                .Une définition est choisie au hasard parmi celles disponibles.
                .L'utilisateur est invité à deviner le verbe correspondant à cette définition.
                .L'utilisateur peut demander des indices s'il le souhaite.
                .L'utilisateur a un maximum de 6 tentatives pour répondre correctement.
                .Le score est calculé en fonction du nombre d'essais et d'indices utilisés.
                .Une fois que l'utilisateur a répondu correctement ou a utilisé ses 6 tentatives, la définition et le verbe correspondant sont retirés des listes pour éviter la répétition.
        4. À la fin du quiz, le score total de l'utilisateur est affiché.
         */

        /*
                              TURKCE OZET
        Paylaştığım kod bir Fransızca fiil  quizi uygulamasını içeriyor.
        İşlevselliği şu şekildedir:

        1. İki liste oluşturulur: biri fiillerin listesi (verbesList)
           ve diğeri bunların karşılık gelen tanımlarının listesi (definitionListe).
        2. Kullanıcı, 5 ile 15 arasında soru sayısını seçer.
        3. Kullanıcı tarafından belirlenen soru sayısı kadar:
         - Kullanılabilir tanımlardan rastgele bir tanesi seçilir.
         - Kullanıcıdan bu tanıma karşılık gelen fiili tahmin etmesi istenir.
        - Kullanıcı, istediği takdirde ipucu isteyebilir.
        - Kullanıcıya doğru cevabı bulması için en fazla 6 deneme hakkı verilir.
        - Kullanıcının puanı, kullanılan deneme sayısına ve alınan ipuçlarına göre hesaplanır.
        - Kullanıcı doğru cevabı bulduğunda veya 6 deneme hakkını kullandığında,
          ilgili tanım ve fiil listelerden çıkarılır, böylece tekrarlanmaz.
        4. Quiz sonunda, kullanıcının toplam puanı görüntülenir.
         */

}
