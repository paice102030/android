package com.example.a7.remotelist.model

import com.example.a7.applist.model.LP_web

class LP_data {

    fun getLP_web(): ArrayList<LP_web> {
        val soccerTeamList: ArrayList<LP_web> = ArrayList<LP_web>()

        soccerTeamList.add(LP_web("Javascript", "1930",
                "JavaScript é uma linguagem de programação interpretada.[2] Foi originalmente implementada como parte dos navegadores web para que scripts pudessem ser executados do lado do cliente e interagissem com o usuário sem a necessidade deste script passar pelo servidor, controlando o navegador, realizando comunicação assíncrona e alterando o conteúdo do documento exibido."
                , "https://banner2.kisspng.com/20180720/pjj/kisspng-javascript-logo-html-clip-art-javascript-logo-5b5188b16dbcd8.5939232615320700654495.jpg"))

        soccerTeamList.add(LP_web("CSS", "1912",
                "CSS é a sigla para o termo em inglês Cascading Style Sheets, que traduzido para o português significa Folha de Estilo em Cascatas. O CSS é fácil de aprender e entender e é facilmente utilizado com as linguagens de marcação HTML ou XHTML."
                , "https://banner2.kisspng.com/20180328/cpw/kisspng-css3-cascading-style-sheets-logo-html-logo-5abbf51bcb7d93.3094819215222674198335.jpg"))

        soccerTeamList.add(LP_web("HTML5", "1914",
                "HTML é uma das linguagens que utilizamos para desenvolver websites. O acrônimo HTML vem do inglês e significa Hypertext Markup Language ou em português Linguagem de Marcação de Hipertexto."
                , "https://logodownload.org/wp-content/uploads/2016/10/html5-logo.png"))

        soccerTeamList.add(LP_web("Docker", "1910",
                "Docker provides container software that is ideal for developers and teams looking to get started and experimenting with container-based applications. Docker Desktop provides an integrated container-native development experience; it launches as an application from your Mac or Windows toolbar and provides access to the largest library of community and certified Linux and Windows Server content from Docker Hub."
                , "https://www.clipartmax.com/png/middle/146-1469815_docker-logo-docker-png.png"))

        return soccerTeamList;
    }
}
