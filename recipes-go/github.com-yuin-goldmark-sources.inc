SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.8.5.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.8.5;downloadfilename=github-com-yuin-goldmark-1.8.5.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "2fa45e249cefad0a1b2ae0efebbaf59a86380a211349d3e9f04dbc172830cf53"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

