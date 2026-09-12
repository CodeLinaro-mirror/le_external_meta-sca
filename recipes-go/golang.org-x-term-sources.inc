SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.46.0.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.46.0;downloadfilename=golang-org-x-term-0.46.0.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "9147fdd982f1aed1392183d5b48055f4f74c85d496604766c7f0b1d3bbd61c7c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/term/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
