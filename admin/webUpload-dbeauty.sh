rm -rf ~/tmp/jailer
rm -rf ~/tmp/1
rm -rf ~/tmp/1.co
mkdir ~/tmp/jailer
mkdir ~/tmp/1
mkdir ~/tmp/1.co
cd ~/tmp/1.co
svn checkout --username=rwisser https://svn.code.sf.net/p/jailer/code/trunk/doc/web/dbeauty jailer-code
cd ..
mv 1.co/dbeauty/* jailer
cd jailer

find . -iname "*.htm" -exec sed "s|class=\"spacer\" .*width=\"100%\"> *<br>|class=\"spacer\" width=\"100%\">|g" '{}' --in-place  \;
find . -iname "*.html" -exec sed "s|class=\"spacer\" .*width=\"100%\"> *<br>|class=\"spacer\" width=\"100%\">|g" '{}' --in-place  \;

sed "s|</body>|<script type=\"text/javascript\">var pkBaseURL = ((\"https:\" == document.location.protocol) ? \"https://sourceforge.net/apps/piwik/jailer/\" : \"http://sourceforge.net/apps/piwik/jailer/\"); document.write(unescape(\"%3Cscript src='\" + pkBaseURL + \"piwik.js' type='text/javascript'%3E%3C/script%3E\")); </script><script type=\"text/javascript\"> try { var piwikTracker = Piwik.getTracker(pkBaseURL + \"piwik.php\", 2); piwikTracker.trackPageView(); piwikTracker.enableLinkTracking(); } catch( err ) {} </script></body>|g" *.htm --in-place
sed "s|</body>|<script type=\"text/javascript\">var pkBaseURL = ((\"https:\" == document.location.protocol) ? \"https://sourceforge.net/apps/piwik/jailer/\" : \"http://sourceforge.net/apps/piwik/jailer/\"); document.write(unescape(\"%3Cscript src='\" + pkBaseURL + \"piwik.js' type='text/javascript'%3E%3C/script%3E\")); </script><script type=\"text/javascript\"> try { var piwikTracker = Piwik.getTracker(pkBaseURL + \"piwik.php\", 2); piwikTracker.trackPageView(); piwikTracker.enableLinkTracking(); } catch( err ) {} </script></body>|g" *.html --in-place

cp home-db.htm index.html
find -iname ".svn" -exec rm -rf '{}' \;
find -iname ".cvs*" -exec rm -rf '{}' \;

scp -r * rwisser,dbeauty@web.sf.net:/home/project-web/dbeauty/htdocs/

