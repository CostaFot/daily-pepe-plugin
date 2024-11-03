package com.github.costafot.intellijplugin.listeners

import com.intellij.execution.testframework.AbstractTestProxy
import com.intellij.execution.testframework.TestStatusListener
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages

class MyTestStatusListener : TestStatusListener() {
    private val logger = Logger.getInstance(MyTestStatusListener::class.java)

    /*override fun testFinished(proxy: SMTestProxy) {
        if (proxy.isPassed) {
            logger.info("Test passed: ${proxy.name}")
            // Add your custom reaction here
        }
    }*/

    override fun testSuiteFinished(root: AbstractTestProxy?, project: Project?) {
        super.testSuiteFinished(root, project)
    }

    override fun testSuiteFinished(proxy: AbstractTestProxy?) {
        if (proxy?.isPassed == true) {
            Messages.showMessageDialog("Go fuck yourself", "Test Passed", Messages.getInformationIcon())
            //   thisLogger().warn("Test passed: ${proxy.name}")
            // Add your custom reaction here
        }
    }
}