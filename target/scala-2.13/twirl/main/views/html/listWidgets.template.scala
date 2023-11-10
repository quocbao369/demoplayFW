
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._
/*1.2*/import play.mvc.Http.Request

object listWidgets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[Widget],Form[WidgetData],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(widgets: Seq[Widget], form: Form[WidgetData])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Product")/*4.17*/ {_display_(Seq[Any](format.raw/*4.19*/("""
"""),format.raw/*5.1*/("""<div class="container">
    <h1>Product</h1>
    <ul>
        <li><a href=""""),_display_(/*8.23*/routes/*8.29*/.WidgetController.index),format.raw/*8.52*/("""">Home</a></li>
    </ul>


    <div class="flash">
    """),_display_(/*13.6*/request/*13.13*/.flash.asScala().data.map/*13.38*/ { case (name, value) =>_display_(Seq[Any](format.raw/*13.62*/("""
    """),format.raw/*14.5*/("""<div class="alert">"""),_display_(/*14.25*/value),format.raw/*14.30*/("""</div>
    """)))}),format.raw/*15.6*/("""
    """),format.raw/*16.5*/("""</div>

    <table class="widget-table">
        <thead>
            <tr><th>Product name</th><th>Price</th></tr>
        </thead>
        <tbody>
        """),_display_(/*23.10*/for(w <- widgets) yield /*23.27*/ {_display_(Seq[Any](format.raw/*23.29*/("""
            """),format.raw/*24.13*/("""<tr><td>"""),_display_(/*24.22*/w/*24.23*/.name),format.raw/*24.28*/("""</td><td>"""),_display_(/*24.38*/w/*24.39*/.price),format.raw/*24.45*/("""</td></tr>
        """)))}),format.raw/*25.10*/("""
        """),format.raw/*26.9*/("""</tbody>
    </table>

    <hr/>

    """),_display_(/*31.6*/if(form.hasGlobalErrors)/*31.30*/ {_display_(Seq[Any](format.raw/*31.32*/("""
        """),format.raw/*32.9*/("""<div class="error">
        """),_display_(/*33.10*/form/*33.14*/.globalErrors.asScala.map/*33.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*33.88*/("""
            """),format.raw/*34.13*/("""<div>"""),_display_(/*34.19*/error/*34.24*/.key),format.raw/*34.28*/(""": """),_display_(/*34.31*/error/*34.36*/.message),format.raw/*34.44*/("""</div>
        """)))}),format.raw/*35.10*/("""
        """),format.raw/*36.9*/("""</div>
    """)))}),format.raw/*37.6*/("""

    """),_display_(/*39.6*/helper/*39.12*/.form(routes.WidgetController.createWidget)/*39.55*/ {_display_(Seq[Any](format.raw/*39.57*/("""
        """),_display_(/*40.10*/helper/*40.16*/.CSRF.formField),format.raw/*40.31*/("""

        """),format.raw/*42.9*/("""<div class="form-field">
        """),_display_(/*43.10*/helper/*43.16*/.inputText(form("name"), '_label -> "Product name")),format.raw/*43.67*/("""
        """),format.raw/*44.9*/("""</div>

        <div class="form-field">
        """),_display_(/*47.10*/helper/*47.16*/.inputText(form("price"), '_label -> "Price")),format.raw/*47.61*/("""
        """),format.raw/*48.9*/("""</div>

        <button type="submit" class="btn">Create Product</button>
    </div>
    """)))}),format.raw/*52.6*/("""
""")))}),format.raw/*53.2*/("""
"""))
      }
    }
  }

  def render(widgets:Seq[Widget],form:Form[WidgetData],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(widgets,form)(request,messages)

  def f:((Seq[Widget],Form[WidgetData]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (widgets,form) => (request,messages) => apply(widgets,form)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/listWidgets.scala.html
                  HASH: ebcc177274f141e17c675b18cb309aeae35c3a96
                  MATRIX: 610->1|998->31|1195->135|1222->137|1245->152|1284->154|1311->155|1413->231|1427->237|1470->260|1553->317|1569->324|1603->349|1665->373|1697->378|1744->398|1770->403|1812->415|1844->420|2027->576|2060->593|2100->595|2141->608|2177->617|2187->618|2213->623|2250->633|2260->634|2287->640|2338->660|2374->669|2439->708|2472->732|2512->734|2548->743|2604->772|2617->776|2651->801|2738->850|2779->863|2812->869|2826->874|2851->878|2881->881|2895->886|2924->894|2971->910|3007->919|3049->931|3082->938|3097->944|3149->987|3189->989|3226->999|3241->1005|3277->1020|3314->1030|3375->1064|3390->1070|3462->1121|3498->1130|3575->1180|3590->1186|3656->1231|3692->1240|3812->1330|3844->1332
                  LINES: 23->1|28->2|33->3|34->4|34->4|34->4|35->5|38->8|38->8|38->8|43->13|43->13|43->13|43->13|44->14|44->14|44->14|45->15|46->16|53->23|53->23|53->23|54->24|54->24|54->24|54->24|54->24|54->24|54->24|55->25|56->26|61->31|61->31|61->31|62->32|63->33|63->33|63->33|63->33|64->34|64->34|64->34|64->34|64->34|64->34|64->34|65->35|66->36|67->37|69->39|69->39|69->39|69->39|70->40|70->40|70->40|72->42|73->43|73->43|73->43|74->44|77->47|77->47|77->47|78->48|82->52|83->53
                  -- GENERATED --
              */
          