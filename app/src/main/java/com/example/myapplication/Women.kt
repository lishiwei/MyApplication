package com.example.myapplication

import javax.inject.Inject
import javax.inject.Named
import javax.inject.Qualifier


class Women : Human {
    var name:String=""
    var sex :String=""
    @Inject
    constructor()
    {

    }
    constructor( name:String, sex:String){
        this.name=name
        this.sex=sex
    }

    override fun toString(): String {

        return "Women(name='$name', sex='$sex')"
    }
}
