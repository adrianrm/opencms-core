<%@ page session="false" import="org.opencms.frontend.templateone.modules.*" %><%--
--%><%@ taglib prefix="cms" uri="http://www.opencms.org/taglib/cms" %><%--
--%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%--
--%><%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><%

CmsTemplateModules cms = new CmsTemplateModules(pageContext, request, response);

// get currently active locale to initialize message bundle
String locale = cms.getRequestContext().getLocale().toString();
pageContext.setAttribute("locale", locale);

String folder = request.getParameter("folder");
String folderTitle = cms.property("Title", folder, "");

%><cms:contentload collector="%(param.collector)" param="%(param.folder)event_%(number).html|event|%(param.count)" preload="true"><%--

--%><cms:contentinfo var="contentInfo" scope="request" /><%--
--%><c:if test="${! contentInfo.emptyResult}"><%--

--%><fmt:setLocale value="${locale}" /><%--
--%><fmt:bundle basename="org/opencms/frontend/templateone/modules/workplace"><%--

--%><div class="sidelist">
<p class="sidelisthead"><% if (!"".equals(folderTitle)) { out.print(folderTitle); } else { %><fmt:message key="events.headline" /><% } %></p>
<cms:contentload editable="true">

<p class="sidelistitem"><a class="sidelistitemhead" href="<cms:link><cms:contentshow element="%(opencms.filename)" />?uri=<%= cms.getRequestContext().getUri() %></cms:link>"><cms:contentshow element="Title" /></a><br>
<cms:contentcheck ifexists="EventDates/EventDate"><c:set var="dateString">
	<cms:contentshow element="EventDates/EventDate" />
</c:set>
<%
	cms.setDate("dateString");
%>
<fmt:formatDate value="${date}" type="date" pattern="EE" />, <fmt:formatDate value="${date}" type="date" dateStyle="short" /><cms:contentcheck ifexists="ShortDescription"> - </cms:contentcheck></cms:contentcheck><cms:contentcheck ifexists="ShortDescription"><cms:contentshow element="ShortDescription" /></cms:contentcheck>
</p>

</cms:contentload></div><%--
--%></fmt:bundle></c:if></cms:contentload>