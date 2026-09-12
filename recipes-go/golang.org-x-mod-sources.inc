SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.41.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.41.0;downloadfilename=golang-org-x-mod-0.41.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "201e678d0a35b18b246abe58d80017b75d60be21cbaf4cbb9e963b48872565a9"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

