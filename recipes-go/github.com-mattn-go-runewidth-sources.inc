SRC_URI += "https://proxy.golang.org/github.com/mattn/go-runewidth/@v/v0.0.28.zip;srcoutput=github.com/mattn/go-runewidth;srcinput=github.com/mattn/go-runewidth@v0.0.28;downloadfilename=github-com-mattn-go-runewidth-0.0.28.zip;name=github-com-mattn-go-runewidth"
SRC_URI[github-com-mattn-go-runewidth.sha256sum] = "7e8df69a8b9ccb1e05a8d6e8cbce89be7a2b1031b6155903594aef24a7e28825"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/mattn/go-runewidth/LICENSE;md5=24ce168f90aec2456a73de1839037245 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-runewidth-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-clipperhouse-uax29-v2-sources.inc', '', 'github.com-clipperhouse-uax29-v2-sources.inc', d)}
