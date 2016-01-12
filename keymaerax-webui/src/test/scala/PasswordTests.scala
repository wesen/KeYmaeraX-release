import edu.cmu.cs.ls.keymaerax.hydra.Password
import org.scalatest.{FlatSpec, Matchers}

/**
  * For debugging cross-platform password hashing inconsistencies.
  * Created by bbohrer on 1/12/16.
  */
class PasswordTests extends FlatSpec with Matchers {
  "Password hashing" should "be deterministic" in {
    val password = "guest".toCharArray
    val iterations = 10000
    val salt = "0an4u6bHBgg9qS1MTPs9OeRK++SWF5ZjWdOHH63wHRvUnAACeOlyENh8BrUNES6Se3X6zbKosVM2NPOotzwFeaKqnD7Lo28Md2t2ry/7REpFkoBfZH2igi6kNct2YrJZd6DBLDBlJSXPYhg6+FqLMojN7p1KFS4In3Jc8ZgYd/d2YFNiad/yQvoLNZlNvT23QRU7aa1xA/6Bgz8j9wzfHugOzfdKiMzUL8ZpGc0yE0F1CRqR0LDm8ndnDse3lY+6MWSMFrx5mnpeNTEiKLVzdD82djYG/Cw+LXbYYk8Qy5PgXxIZCEL2oLbfDljhUKdoKR6v0dR1pDcxMYsvG3G0Tl7qRcLYkz4gTqDHIK6voQNv+KQe+9A9TN8BnaBLPmq1cs9lJo71pWSrDiwAeo2n9Y2SXfi50gzkybk2cdEpVP9WValJEiSOjc+STJR+nhnp3QIQUdByfZLFR7AK28PxnGmRX5IrbtjWlR58WIrQZ5zJkR+0DvHYAqvLBvbbYgyo5E57mr8TkQ4LBQ+D/Tbyxoq5z61H5bqDkomEiP/w3l/M3jnLk0kiIxMU5MqYdwN789K3qjLI62q9d48rJRbZh1wN8zvat+E8VTswhWJkT014682LfkNlXE8T47MKcoo332gR0t0+5jH2rqXrhvQNOn6VzMUAIrlYl1XCsDSo2Lw="
      .getBytes("UTF-8")
    val hash = "at0PaS1QO+padpcAMwZmmu4TbTDU6xRsO66mB3LTyECF0xuqvTz8Z0weIIJ5EXWkdgbTRy1KeYqzrJX1gtBMFtUmUxBTVj7NIMWujWbFr9urj4zSoliDNO3DyYBLM7GkYtxB9ZP8ctgOwER1Nb8ReJ4UbRM61WpqE4W4y7vtdPAxHjafmJNPIbLdgHEfPJf/r5rz2Ja/iXla6jGyKeHB/9YcuuxVYKl5B1jAjbYDZQSSdnTsp2NjgHbCV1MyjRFDZXAzFtkKrlRRSsEJbKou7ypeLGLE43z6gMjE1/BcYBozveXhvJgd/6KrGG93eDkZIqV1N6IIT9aJrtvfIjx3/XaAivuPxGOxsZa4f8FyT6AvrRE6iCobak2hbP285SqYBaqlo2UFtefQ8wFzKehwT1voIKy8csj+FmkkUFe4JhqHEkwD50JslSfz0MgTTGG2kNlLNv4jrv78QDkCn/Wc52C6y6NIYO0/zjkNuvB92U1TV2sSF98EVZfH0yYoy/K21cJJfkxyBAd19U9ES3X6UhjjgH94EHulWVkomQIGPWrGgd/dexoWKGZOHGPDrIR2ArXhCLbfB9+Ubn3NpAE12yPt2s68UV3ETP5BbfLyElc7q61cL1xO3455WfAGi7QS7BBnJ/r5r08VM6yMe6dXRP8xKzt+BGnWuKWw8Hqaoh94vmR6UtAxAlA6E9eTZYnDfpdgbnA2X3fPRQXHHKR1mq9BnIXfTZZeJom4VDzT+fip8dlZGlSlXb9CmhMg2+cPUxqaJUq5W0Rt+7BDsob/0cPHme1MIVlIYholLQe6xthbOAQgPcVPgb8oMDkH0/3tFv71YO5vcAZAaSS2rMrUt60u/s4TReKKHCmz//X2f55eLl7RE6smSLX9YesAktfsK1sWky+zNwWreoGz"
    Password.hash(password, salt, iterations) shouldBe hash
  }
}
