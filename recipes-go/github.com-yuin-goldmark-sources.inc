SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.8.6.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.8.6;downloadfilename=github-com-yuin-goldmark-1.8.6.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "6cb11723302ba0dd45f8d7a26f7fa3c48be23523622c18293783ce82a3c5de46"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

