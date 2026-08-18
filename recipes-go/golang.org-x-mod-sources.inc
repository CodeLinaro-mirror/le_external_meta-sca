SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.40.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.40.0;downloadfilename=golang-org-x-mod-0.40.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "a191080b1494c194059ae71aa1d300741a8e24dfb6e28cd32580dbdcc52a0598"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

