 
listView('aeffeewagwaefwefs Jobs') {
    description('aeffeewagwaefwefs Jobs')
    jobs {
        regex('aeffeewagwaefwefs_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
