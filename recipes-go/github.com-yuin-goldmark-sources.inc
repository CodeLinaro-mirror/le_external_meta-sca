SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.8.4.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.8.4;downloadfilename=github-com-yuin-goldmark-1.8.4.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "b74beb4cab56f9a197024c7da7def440133cea623e5667d1dea59e5e051499cf"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

