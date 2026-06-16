SUMMARY = "Parse Perl string literals and string-literal-like things"
HOMEPAGE = "https://metacpan.org/pod/PPIx::QuoteLike"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=48;md5=0f40d316ab30a87ae4b53e6ea3f983fe"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-QuoteLike-${PV}.tar.gz"

SRC_URI[md5sum] = "b32e22eee1fadb036a7d8e4c238e2869"
SRC_URI[sha256sum] = "b71da7748be3a0ab7c19fe8a3ddf7fec480180342c8e76654d28582281152e07"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/PPIx-QuoteLike-${PV}"

inherit cpan_build
inherit cpan-fixups
inherit cpan-fixups
inherit_defer native

do_install:append() {
    # Remove .packlist file, as it contains host specific paths
    # and doesn't serve a real purpose
    find ${D} -name ".packlist" -delete
}
