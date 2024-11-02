package org.example

import krpc.client.Connection
import krpc.client.RPCException
import krpc.client.services.KRPC


fun main() {
    val conn = Connection.newInstance()
    val krpc = KRPC.newInstance(conn)

    val status = krpc.status

    println(status)
    conn.close()
}