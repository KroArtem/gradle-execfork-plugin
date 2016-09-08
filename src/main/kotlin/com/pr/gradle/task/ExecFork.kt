package com.pr.gradle.task

open class ExecFork : AbstractExecFork() {
    var commandLine:String? = null

    override fun getProcessArgs(): List<String>? {
        val processArgs:MutableList<String> = mutableListOf()
        processArgs.add(commandLine!!)
        processArgs.addAll(args)
        return processArgs
    }
}